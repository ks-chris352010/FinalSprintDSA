package com.keyin.FinalSprint.Entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    @Test
    public void testInsert() {
        BinaryTree tree = new BinaryTree();

        tree.insert(98);
        tree.insert(87);
        tree.insert(4);
        tree.insert(6);

        assertNotNull(tree.getRoot());
        assertEquals(98, tree.getRoot().value);
        assertEquals(87, tree.getRoot().left.value);
    }
}
