package com.example.recursion;

import java.util.Arrays;

public class Task1079 {
    public int numTilePossibilities(String tiles) {
        int[] lettersCountMap = new int[26];
        int[] uniqueLettersCode = new int[26];

        int uniqueLetterIndex = 0;

        for (int i = 0; i < tiles.length(); i++) {
            int letterCode = tiles.charAt(i) - 'A';
            lettersCountMap[letterCode] += 1;

            if (lettersCountMap[letterCode] == 1) {
                uniqueLettersCode[uniqueLetterIndex] = letterCode;
                uniqueLetterIndex += 1;
            }
        }
        return getSequencesCount(lettersCountMap, uniqueLettersCode, uniqueLetterIndex);
    }

    int getSequencesCount(int[] lettersCountMap, int[] uniqueLettersCodes, int uniqueLettersCount) {
        int sequenceCount = 0;
        for (int i = 0; i < uniqueLettersCount; i++) {

            int letterCode = uniqueLettersCodes[i];
            if (lettersCountMap[letterCode] == 0) {
                continue;
            }
            lettersCountMap[letterCode] -= 1;
            sequenceCount += getSequencesCount(lettersCountMap, uniqueLettersCodes, uniqueLettersCount) + 1;
            lettersCountMap[letterCode] += 1;
        }
        return sequenceCount;
    }
}
