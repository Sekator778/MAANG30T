package com.example.recursion;

public class Task1718 {
    public int[] constructDistancedSequence(int n) {
        int[] sequence = new int[2 * n - 1];
        getSequence(sequence, 0, new boolean[21], n);
        return sequence;
    }

    boolean getSequence(int[] seqCandidate, int seqStartIndex, boolean[] usedNums, int lasNum) {
        if (seqStartIndex == seqCandidate.length) {
            return true;
        }
        // якщо seqCandidate[seqStartIndex] > 0, то вже є число на цьому місці
        if (seqCandidate[seqStartIndex] > 0) {
            // тому переходимо до наступного елементу
            return getSequence(seqCandidate, seqStartIndex + 1, usedNums, lasNum);
        }
        // початок з найбільшого числа
        for (int num = lasNum; num >= 1; num--) {
            if (usedNums[num]) {
                continue;
            }
            // якщо num == 1, то використовуємо його одразу
            if (num == 1) {
                seqCandidate[seqStartIndex] = 1;
            } else {
                // якщо num > 1, то перевіряємо чи можна використати його у відповідних індексах
                if (seqStartIndex + num >= seqCandidate.length || seqCandidate[seqStartIndex + num] > 0) {
                    continue;
                }
                seqCandidate[seqStartIndex] = num;
                seqCandidate[seqStartIndex + num] = num;
            }
            // помічаємо, що num вже використано
            usedNums[num] = true;
            // рекурсивно шукаємо наступний елемент
            if (getSequence(seqCandidate, seqStartIndex + 1, usedNums, lasNum)) {
                return true;
            }
            // якщо не знайшли, то звільняємо num
            usedNums[num] = false;
            // якщо num == 1, то звільняємо його одразу
            seqCandidate[seqStartIndex] = 0;
            if (num > 1) {
                // якщо num > 1, то звільняємо його у відповідних індексах
                seqCandidate[seqStartIndex + num] = 0;
            }
        }
        return false;
    }
}




