//*******************************************************************
//  MagazineList.java       Author: Lewis/Loftus
//
//  Represents a collection of magazines.
//*******************************************************************

public class MagazineList {
    private MagazineNode list;

    //----------------------------------------------------------------
    //  Sets up an initially empty list of magazines.
    //----------------------------------------------------------------
    public MagazineList() {
        list = null;
    }

    //----------------------------------------------------------------
    //  Creates a new MagazineNode object and adds it to the end of
    //  the linked list.
    //----------------------------------------------------------------
    public void add(Magazine mag) {

        MagazineNode node = new MagazineNode(mag);
        MagazineNode current;

        if (list == null)
            list = node;
        else {
            current = list;
            while (current.next != null)
                current = current.next;
            current.next = node;
        }
    }

    //----------------------------------------------------------------
    //  Creates a new MagazineNode object and adds it to the front of
    //  the linked list.
    //----------------------------------------------------------------
    public void insert(Magazine mag) {
        MagazineNode node = new MagazineNode(mag);
        if (node == null)
            return;
        else {
            if (list == null) {
                node.next = null;
                list = node;
            } else {
                node.next = list;
                list = node;
            }
        }
    }

    public void deleteAll() {
        list = null;
    }

    //----------------------------------------------------------------
    //  Returns this list of magazines as a string.
    //----------------------------------------------------------------
    public String toString() {
        String result = "";

        MagazineNode current = list;

        while (current != null) {
            result += current.magazine + "\n";
            current = current.next;
        }

        return result;
    }

    public void delete(Magazine mag) {
        if (list == null) throw new RuntimeException("Cannot delete, Empty List");

        if (list.magazine.equals(mag)) {
            list = list.next;
            return;
        }

        MagazineNode cur = list;
        MagazineNode prev = null;

        while (cur != null && !cur.magazine.equals(mag)) {
            prev = cur;
            cur = cur.next;
        }

        if (cur == null) throw new RuntimeException("Cannot delete, not in list");

        //delete cur node
        prev.next = cur.next;
    }


    //*****************************************************************
    //  An inner class that represents a node in the magazine list.
    //  The public variables are accessed by the MagazineList class.
    //*****************************************************************
    private class MagazineNode {
        public Magazine magazine;
        public MagazineNode next;

        //--------------------------------------------------------------
        //  Sets up the node
        //--------------------------------------------------------------
        public MagazineNode(Magazine mag) {
            magazine = mag;
            next = null;
        }
    }
}

