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
        if (seqCandidate[seqStartIndex] > 0) {
            return getSequence(seqCandidate, seqStartIndex + 1, usedNums, lasNum);
        }

        for (int num = lasNum; num >= 1; num--) {
            if (usedNums[num]) {
                continue;
            }
            if (num == 1) {
                seqCandidate[seqStartIndex] = 1;
            } else {
                if (seqStartIndex + num >= seqCandidate.length || seqCandidate[seqStartIndex + num] > 0) {
                    continue;
                }
                seqCandidate[seqStartIndex] = num;
                seqCandidate[seqStartIndex + num] = num;
            }
            usedNums[num] = true;

            if (getSequence(seqCandidate, seqStartIndex + 1, usedNums, lasNum)) {
                return true;
            }
            usedNums[num] = false;
            seqCandidate[seqStartIndex] = 0;
            if (num > 1) {
                seqCandidate[seqStartIndex + num] = 0;
            }
        }
        return false;
    }
}




