package com.keyin.FinalSprint.Services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.keyin.FinalSprint.Entities.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeServiceTest {

    @Test
    public void testProcessUserNums() {
        BinaryTreeService service = new BinaryTreeService();
        service.processUserNums("98,87,4,6");

        BinaryTree tree = service.getBinaryTree();

        assertNotNull(tree);
        assertEquals(98, tree.getRoot().getValue());
        assertEquals(87, tree.getRoot().getLeft().getValue());
    }

    @Test
    public void testConvertTreeToJSON() throws JsonProcessingException {
        BinaryTreeService service = new BinaryTreeService();
        service.processUserNums("98,87,4,6");

        String json = service.convertTreeToJson(service.getBinaryTree().getRoot());

        assertNotNull(json);
        assertTrue(json.contains("\"value\":98"));
        assertTrue(json.contains("\"left\":{\"value\":87"));
        assertTrue(json.contains("\"right\":{\"value\":6"));
        assertTrue(json.contains("\"left\":{\"value\":4"));
    }
}
