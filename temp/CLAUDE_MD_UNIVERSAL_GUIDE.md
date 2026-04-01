# Universal Guide: CLAUDE.md Best Practices for Java Projects

> Compiled from: Telegram community discussions (2026-02-08 — 2026-03-31), Anthropic docs, community repos
> Date: 2026-04-01

---

## Part 1: Core Principles

### 1.1 Budget: 150-200 Lines Max

CLAUDE.md has a compliance cliff at ~150-200 lines. Beyond that, the agent starts ignoring instructions.

**Rule of thumb**: For every line ask — "Would Claude make a mistake without this?" If no — delete it.

Longer CLAUDE.md = lower adherence = wasted tokens = worse results.

### 1.2 CLAUDE.md = Router, Not Manual

> "если воспринимать AGENTS.md CLAUDE.md только как роутеры и разносить в такие md WHY и HOW"
> — Almaz Bikchurin, 13.03.2026

CLAUDE.md should **route** to detailed knowledge files, not contain everything inline.

```
CLAUDE.md (80-100 lines)          ← Auto-loaded, always in context
  @.claude/rules/patterns.md     ← Loaded on demand when referenced
  @.claude/rules/database.md     ← Loaded on demand when referenced
  @.claude/rules/testing.md      ← Loaded on demand when referenced
```

### 1.3 Progressive Disclosure

> "Большие agents.md всегда были вредны — поэтому только progressive disclosure. Мусором агента кормить — всегда была так себе идея. В доку/правила лучше писать по теме и кратко."
> — Denis Kiselev, 28.02.2026

Agent loads only what's needed, when it's needed. Small semantic files > one giant document.

### 1.4 Architecture IS the Prompt

> "архитектура — это и есть промпт. Если код честно рассказывает о себе через структуру и интерфейсы, ИИ становится по-настоящему мощным инструментом. Если нет — никакой промпт-инжиниринг не спасёт."
> — Ryzhikov Nikolai, 27.02.2026

Clean project structure matters more than verbose instructions. The agent reads your code — if it's well-organized, the agent understands it.

### 1.5 Don't Auto-Generate

> ETH Zurich research (27.02.2026): auto-generated context files **reduce success rate by 2-3%** and **increase inference cost by 20%+**. Human-written give only ~4% improvement but at least don't hurt.
> Recommendation: write manually, only mandatory rules and specific tooling.

### 1.6 Don't Overload

> "AGENTS.md пытались завалить информацией и это было ошибкой"
> — OpenAI Harness Engineering blog, cited 24.02.2026

Even OpenAI found that stuffing too much info into agent instructions is counterproductive.

---

## Part 2: Recommended Structure

### 2.1 Minimal Template (Java / Spring Boot)

```markdown
# Project Name

## Build & Test
mvn clean compile                    # Compile
mvn test                             # Unit tests
mvn clean package -DskipTests       # Build JAR
java -jar target/app.jar --spring.profiles.active=dev

## Stack
Java 21, Spring Boot 3.x, R2DBC (reactive), PostgreSQL, Kafka

## Code Style
- All classes `final`, no static methods
- Reactive everywhere: Mono<T>, Flux<T>, never .block() except tests
- Always .timeout(Duration.ofSeconds(5)) on repository calls
- Interfaces in service/, implementations are @Service beans
- No null returns — use Optional or Mono.empty()

## Architecture
- Base package: com.example.myapp
- Message flow: [Source] -> Kafka -> Processing -> [Output]
- DB changes: only via Liquibase changesets
- Profiles: dev, test, prod

## Never Do
- Never .block() in production code
- Never direct DDL — Liquibase only
- Never return null
- Never add static utility methods
- Never System.out.println — use SLF4J

## Compact Instructions
During compaction, preserve in priority order:
1. Architectural decisions (NEVER summarize)
2. Changed files and key modifications
3. Current verification status (pass/fail)
4. Open TODOs and rollback notes
5. Tool outputs (can be dropped, keep pass/fail only)

## Detailed Rules
See @.claude/rules/patterns.md
See @.claude/rules/database.md
See @.claude/rules/testing.md
```

**Total: ~40 lines.** Clean, scannable, everything critical is covered.

### 2.2 Sections Breakdown

| Section | Purpose | Lines |
|---------|---------|-------|
| Build & Test | Exact copy-paste commands | 4-6 |
| Stack | One-line tech summary | 1-2 |
| Code Style | Non-obvious conventions only | 5-8 |
| Architecture | Key patterns, base package, flow | 4-6 |
| Never Do | Critical anti-patterns | 3-5 |
| Compact Instructions | Context preservation rules | 6-8 |
| References | Links to detailed docs | 3-5 |
| **Total** | | **30-40** |

### 2.3 Extended Structure (with .claude/ folder)

```
project/
├── CLAUDE.md                       # Router (40-80 lines)
├── .claude/
│   ├── rules/
│   │   ├── patterns.md             # Code patterns & anti-patterns
│   │   ├── database.md             # Schema, migrations, R2DBC quirks
│   │   ├── testing.md              # Test conventions, coverage rules
│   │   └── security.md             # Security rules
│   ├── skills/
│   │   └── code-review/SKILL.md    # Custom skills
│   ├── settings.json               # Permissions, hooks config
│   └── hooks/
│       └── validate-commit.sh      # Git hooks
```

---

## Part 3: What to Include

### 3.1 MUST Include (High Impact)

**Build & test commands** — exact invocations the agent can copy-paste:
```markdown
mvn clean compile                    # Verify compilation
mvn test -Dtest=ClassName           # Run single test
timeout 10m mvn test > /tmp/test.log 2>&1  # With timeout + log
```

**Non-obvious code conventions** — things the agent would get wrong otherwise:
```markdown
- Use reactive patterns (Mono/Flux), never .block()
- All classes must be final
- No -er suffix in class names (use nouns)
- @Service with interfaces, no static utilities
```

**Critical anti-patterns with WHY**:
```markdown
## Never Do
- Never .block() — corrupts reactive pipeline, causes thread starvation
- Never parallel TDLib LoadChats — corrupts pagination state
- Never skip .timeout() on DB calls — causes hanging operations
```

**Compact Instructions** — controls context compaction:
```markdown
## Compact Instructions
During compaction, preserve in priority order:
1. Architectural decisions (NEVER summarize)
2. Changed files and key modifications
3. Current verification status (pass/fail)
4. Open TODOs and rollback notes
5. Tool outputs (can be dropped, keep pass/fail only)
```

### 3.2 SHOULD Include (Medium Impact)

**Architecture summary** — 3-5 sentences, entry points, data flow:
```markdown
## Architecture
Spring Boot 3.3.4 reactive app. Base package: com.example.app
Flow: TDLight -> Kafka -> LLM Pipeline -> Telegram
All DB via R2DBC. Schema managed by Liquibase.
```

**Profiles and environment**:
```markdown
## Profiles
dev, test, prod. Use: --spring.profiles.active=dev
Required env: DATABASE_URL, API_KEY, KAFKA_SERVERS
```

**Git workflow** (brief):
```markdown
## Git
- Conventional commits: feat/fix/refactor/test/docs/chore
- Never force-push to main
```

### 3.3 CAN Include (Low Impact, Optional)

- Module layout table (package -> responsibility)
- Key domain models (1-2 sentences each)
- Troubleshooting hints for common errors
- References to external docs/APIs

---

## Part 4: What NOT to Include

### 4.1 Anti-Patterns (Community Consensus)

| Anti-Pattern | Why Bad | Alternative |
|---|---|---|
| Full coding standards (50+ rules) | Agent ignores after ~20 rules | Top 5 rules only, use linter for rest |
| Task management workflows | Not about code, wastes tokens | Separate workflow docs |
| Repeated warnings (same rule 5x) | Diminishing returns, token waste | State once clearly |
| Full API endpoint lists | Agent reads controllers | Let agent discover from code |
| Dependency versions | Agent reads pom.xml/build.gradle | Reference pom.xml |
| Step-by-step tutorials | Too verbose | Link to docs |
| Historical context / changelogs | Stale, not actionable | git log |
| Code snippets longer than 5 lines | Become stale fast | Reference source files |
| Environment variable docs | Belongs in .env.example | .env.example |
| Process docs (CI/CD, deploy) | Not code-related | Wiki/runbook |
| "Write clean code" type truisms | Agent already knows | Delete |
| Auto-generated context | -2-3% success rate (ETH Zurich) | Write manually |

### 4.2 The Overloading Trap

> "архитектура наверно одна из самых сложных проблем. агент который крутится в цикле и хочет любой ценой закончить задачу начинает срезать углы. и у него точно не возникает мысли может мне вернуться к началу и попробовать иначе"
> — Community discussion, 04.03.2026

More instructions ≠ better behavior. The agent will cut corners regardless. What helps: clear constraints, good tests, simplification passes.

---

## Part 5: Java / Spring Boot Specific Tips

### 5.1 Reactive Patterns

Agents **love** to add `.block()` calls. Explicitly forbid:
```markdown
- Never .block() except in tests
- Chain with .flatMap() for async, .map() for sync
- Errors: .onErrorResume() not try-catch
- Always .timeout(Duration.ofSeconds(5)) on DB calls
```

### 5.2 R2DBC vs JDBC

Document the differences agents miss:
```markdown
- @Transactional works differently with reactive — use TransactionalOperator for complex flows
- PostgreSQL arrays need special R2DBC handling
- Enums stored as text, column must match enum casing
```

### 5.3 Maven Commands

Be explicit about commands and flags:
```markdown
mvn clean compile                    # Verify compilation (do this first!)
mvn test                             # All unit tests
mvn test -Dtest=MyServiceTest       # Single test class
mvn clean package -DskipTests       # Build JAR, skip tests
mvn clean package -DskipITs         # Build JAR, skip integration tests only
```

### 5.4 Spring Boot Specifics

```markdown
- Base package: com.example.myapp (component scan root)
- Profiles: dev, test, prod (via --spring.profiles.active=)
- @ConditionalOnProperty for feature flags / kill switches
- Config precedence: env vars > application-{profile}.yml > application.yml
```

### 5.5 Liquibase

```markdown
- Schema changes ONLY via Liquibase changesets
- Never execute DDL directly
- Changeset files: src/main/resources/db/changelog/changes/
- Naming: NNN-description.yaml (sequential numbering)
```

### 5.6 Testing

```markdown
- Testcontainers for PostgreSQL/Kafka integration tests
- StepVerifier for reactive stream assertions
- MockWebServer for HTTP API mocking
- Test names: full English sentences (shouldReturnEmptyWhenNotFound)
- One assertion per test (last statement)
```

---

## Part 6: Advanced Techniques

### 6.1 Compact Instructions

> "напиши в claude.md: ## Compact Instructions — During compaction, preserve in priority order..."
> — Community tip, 19.03.2026

Add to CLAUDE.md to control what survives context compression:

```markdown
## Compact Instructions
During compaction, preserve in priority order:
1. Architectural decisions (NEVER summarize)
2. Changed files and key modifications
3. Current verification status (pass/fail)
4. Open TODOs and rollback notes
5. Tool outputs (can be dropped, keep pass/fail only)
```

### 6.2 Feedback Loop

> "сделал lessonsLearned цикл через ccbox для апдейта AGENTS.md рулов"
> — Community, 25.03.2026

After agent sessions, analyze what went wrong and update instructions:

1. Install insights skill: `npx skills add diskd-ai/ccbox --skill ccbox-insights --global --yes`
2. Run periodically to analyze failed tool calls
3. Auto-suggest corrections to CLAUDE.md rules

### 6.3 Version Your Instructions

> "я начал делать AURA.md symlink latest на версионные изменения md — это позволяет делать анализ деградации и мутаций"
> — Almaz Bikchurin, 12.03.2026

```
.claude/
  rules/
    patterns-v1.md
    patterns-v2.md
    patterns.md -> patterns-v2.md   # symlink to latest
```

Track changes over time. If agent behavior degrades, diff the versions.

### 6.4 RTK — CLI Output Compression

> "CLI-прокси для сжатия вывода команд. Экономит ~89% токенов на CLI-выводе."
> — Igor Tolstov, 15.02.2026

Install RTK to compress noisy CLI output (mvn test, git status) before it fills the context window. Extends session length significantly.

### 6.5 Simplification Skill

> "пишут что overengineering но если ты запускаешь simplification skill..."
> — Almaz Bikchurin, 19.03.2026

After implementation, run a simplification pass. Agents tend to overengineer. A second pass focused on simplification counters this.

### 6.6 Test Suite as Best Guardrail

> "пройти хороший тестсьют — самая хорошая longhorizon задача для агента"
> — Ryzhikov Nikolai, 13.03.2026

Comprehensive test suites are the best constraint for autonomous agents. Instead of writing 50 rules, write 50 tests.

### 6.7 Fresh Context Per Task

> GSD-2 approach: "Свежий контекст на каждую задачу — каждый юнит работы получает чистое окно контекста (~200k токенов), без накопленного мусора."

Don't accumulate context across tasks. Start each task with a clean context window.

### 6.8 SKILL.md for CLI Tools

> "агенту нужно сделать 2-3 запроса к утилитке чтобы понять как с ней работать — это решается через SKILL.md для каждой тулзы"
> — Danil Pismenny, 03.03.2026

For each CLI tool the agent uses, create a SKILL.md describing interface and parameters. Saves 2-3 discovery requests per invocation.

### 6.9 Separate Memory-Bank from Docs

> "Я сдался и переименовал docs в memory-bank как источник правды, а docs теперь пользовательская документация"
> — Danil Pismenny, 28.03.2026

- `memory-bank/` — source of truth for the agent
- `docs/` — generated user-facing documentation (derivative)

### 6.10 AGENTS.md ↔ CLAUDE.md Symlink

If using multiple AI agents (Claude Code + Codex):
```bash
ln -s CLAUDE.md AGENTS.md
```

One source of truth, both tools read it.

---

## Part 7: Skill Pipeline for Complex Work

> "Plan skill → Split to task skill → Implementation under manager skill → zellij для 50+ задач"
> — Almaz Bikchurin, 31.03.2026

Recommended skill chain for large features:

1. **Plan** — architect the solution, identify files/changes
2. **Split** — break into atomic tasks
3. **Implement** — execute each task with fresh context
4. **Simplify** — run simplification pass to remove overengineering
5. **Review** — code review skill for quality check

---

## Part 8: Useful Resources

### Community Repos
| Repo | Description |
|---|---|
| [shanraisshan/claude-code-best-practice](https://github.com/shanraisshan/claude-code-best-practice) | Curated Claude Code best practices |
| [arhgap11b/AGENTS.md](https://github.com/arhgap11b/AGENTS.md/) | Well-crafted AGENTS.md, refined 6 months |
| [FlorianBruniaux/claude-code-ultimate-guide](https://github.com/FlorianBruniaux/claude-code-ultimate-guide) | Comprehensive guide |
| [diskd-ai skills](https://skills.sh/diskd-ai) | Code review, prompting, insights skills |
| [CodeAlive-AI/fpf-problem-solving-skill](https://github.com/CodeAlive-AI/fpf-problem-solving-skill) | FPF problem-solving skill |

### Articles & Docs
| Link | Topic |
|---|---|
| [Anthropic: Claude Code docs](https://docs.anthropic.com/en/docs/claude-code) | Official docs |
| [Builder.io: How to Write CLAUDE.md](https://www.builder.io/blog/claude-md-guide) | CLAUDE.md guide |
| [ianbull.com/posts/software-architecture](https://ianbull.com/posts/software-architecture) | Architecture for AI agents |
| [OpenAI: Harness Engineering](https://openai.com/index/harness-engineering/) | Don't overload AGENTS.md |
| [Piotr Minkowski: Claude Code for Spring Boot](https://piotrminkowski.com/2026/03/24/claude-code-template-for-spring-boot/) | Spring Boot template |

### Skills Worth Installing
| Skill | Install | Purpose |
|---|---|---|
| ccbox-insights | `npx skills add diskd-ai/ccbox --skill ccbox-insights --global --yes` | Analyze failed tool calls |
| code-review | `npx skills add diskd-ai/code-review --global --yes` | Code review |
| prompting | `npx skills add diskd-ai/prompting --global --yes` | Improve prompts |

---

## Part 9: Checklist for New Project Setup

```
[ ] Write CLAUDE.md (40-80 lines max)
    [ ] Build & test commands (exact copy-paste)
    [ ] Stack summary (1 line)
    [ ] Code style (5-8 non-obvious rules only)
    [ ] Architecture (base package, flow, 3-5 sentences)
    [ ] "Never Do" list (3-5 critical anti-patterns)
    [ ] Compact Instructions section
    [ ] References to .claude/rules/*.md

[ ] Create .claude/ folder structure
    [ ] rules/ — detailed patterns, database, testing docs
    [ ] skills/ — custom project skills if needed
    [ ] settings.json — permissions

[ ] Setup hooks (optional)
    [ ] Commit validation hook
    [ ] RTK for CLI output compression

[ ] Verify
    [ ] CLAUDE.md < 150 lines
    [ ] No auto-generated content
    [ ] No obvious/trivial rules agent already knows
    [ ] No stale information
    [ ] Test: does Claude behave differently with vs without each rule?

[ ] Maintenance plan
    [ ] Review after each major feature
    [ ] Delete rules that never get violated
    [ ] Add rules when agent makes repeated mistakes
    [ ] Version instruction files for tracking
```

---

## Part 10: Quick Reference Card

```
DO                                    DON'T
─────────────────────────────         ─────────────────────────────
Write manually                       Auto-generate
< 150 lines                          > 300 lines
Non-obvious rules only                Obvious conventions
Exact CLI commands                    Vague descriptions
"Never X because Y"                  "Try to avoid X"
Reference files with @               Copy-paste code blocks
Test suite as guardrails              50 text rules
Fresh context per task                Accumulate across tasks
Simplification pass after impl        Accept overengineering
Version your instructions             Treat as static
Delete rules nobody breaks            Keep accumulating forever
```
