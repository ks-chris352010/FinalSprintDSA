package com.keyin.FinalSprint.Services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.keyin.FinalSprint.Entities.BinaryTree;
import com.keyin.FinalSprint.Entities.Node;
import org.springframework.stereotype.Service;

@Service
public class BinaryTreeService {
    private BinaryTree binaryTree;

    public void processUserNums(String nums) {
        if (nums == null || nums.trim().isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty");
        }

        String[] numArray = nums.split(",");
        binaryTree = new BinaryTree();
        for (String num : numArray) {
            try {
                int numInt = Integer.parseInt(num.trim());
                binaryTree.insert(numInt);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid number format: " + num, e);
            }
        }
    }

    public String convertTreeToJson(Node root) throws JsonProcessingException {
        if (root == null) {
            throw new IllegalArgumentException("Root node is null");
        }

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(root);
    }

    public BinaryTree getBinaryTree() {
        return binaryTree;
    }
}
