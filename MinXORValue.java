package com.company;

import java.util.ArrayList;

public class MinXORValue {

    public char[] convertToPaddedBinary(int num, int bitSize) {
        String baseBinary = Integer.toBinaryString(num);

        StringBuilder pad = new StringBuilder();

        for (int i = 0; i < 32 - baseBinary.length(); i++) {
            pad.append("0");
        }
        return (pad + baseBinary).toCharArray();
    }

    public int findMinXor(ArrayList<Integer> A) {

        Node trie = new Node();

        int op = 0;

        for (int i = 0; i < A.size(); i++) {
            trie.insert(this.convertToPaddedBinary(A.get(i), 32));
        }
        return op;
    }

    class Node {
        char val;
        Node nextNode[];

        public Node() {
            this.val = '2';
            this.nextNode = new Node[2];
            for (int i = 0; i < 2; i++) {
                this.nextNode[i] = null;
            }
        }

        public void insert(char[] binSequence) {

            Node root = this;

            for (int i = 0; i < binSequence.length; i++) {
                char position = binSequence[i];

                if (root.nextNode[position] == null) {
                    root.nextNode[position] = new Node();
                }

                if (root.nextNode[position].val != position) {
                    root.nextNode[position].val = position;
                }

            }
        }
    }

}
