package com.example.recursion;

import java.util.Arrays;

public class Task14 {
    public int minSessions(int[] tasks, int sessionTime) {
        if (tasks.length == 1 && tasks[0] <= sessionTime) {
            return 1;
        }
        Arrays.sort(tasks);
        for (int sessionCount = 1; sessionCount < tasks.length; sessionCount++) {
            if (tasksFitInSession(new int[sessionCount], tasks.length - 1, tasks, sessionTime)) {
                return sessionCount;
            }
        }
        return -1;
    }

    private boolean tasksFitInSession(int[] sessions, int taskIndex, int[] tasks, int sessionTime) {
        if (taskIndex == -1) {
            return true;
        }
        int taskTime = tasks[taskIndex];
        for (int i = 0; i < sessions.length; i++) {
            if (i > 0 && sessions[i - 1] == sessions[i]) {
                continue;
            }
            if (sessions[i] + taskTime > sessionTime) {
                continue;
            }

            sessions[i] += taskTime;
            if (tasksFitInSession(sessions, taskIndex - 1, tasks, sessionTime)) {
                return true;
            }
            sessions[i] -= taskTime;
        }
        return false;
    }
}
