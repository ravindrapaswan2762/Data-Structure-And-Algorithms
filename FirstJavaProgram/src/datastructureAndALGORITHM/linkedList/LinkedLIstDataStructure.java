package datastructureAndALGORITHM.linkedList;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedLIstDataStructure {
    public static void main(String[] args) throws Exception {

        linkedList obj = new linkedList();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of LinkedList");
        int size = sc.nextInt();
        System.out.println("Enter the element of LinkedList");
        for (int i=1; i<=size; i++){
            int val = sc.nextInt();
            obj.addLast(val);
        }
//      ----------------------------------------- looping
//        node tp1 = obj.head;
//        node tp2 = obj.head;
//        while (tp1.next != null){
//            tp1 = tp1.next;
//        }
//        while (tp2.data != 3){
//            tp2 = tp2.next;
//        }
//        tp1.next = tp2;
//      ----------------------------------------------


        obj.addFirst(10);
        obj.addLast(100);
//        obj.display();

        obj.addAt(2, 200);
        obj.display();


    }

    public static class node{
        int data;
        node next;
    }

//  summary object class
    public static class linkedList{
        node head;
        node tail;
        int size;


        public int size(){
           return size;
        }
        public void display(){
           node temp = head;
           while (temp != null){
               System.out.print(temp.data+" ");
               temp = temp.next;
           }
            System.out.println();
        }

        public int getFirst(){
           if (size == 0){
               System.out.println("List is empty");
               return -1;
           }
           else {
               return head.data;
           }
        }
        public int getLast(){
            if (size == 0){
                System.out.println("List is empty");
                return -1;
            }
            else {
                return tail.data;
            }

        }
        public int getAt(int idx){
        if (size == 0){
            System.out.println("List is empty");
            return -1;
        }
        else if (idx < 0 || idx >= size){
            System.out.println("Invalid Arguments");
            return -1;
        }
        else if (idx == size-1){
            getLast();
        }
        else if (idx == 0){
            getFirst();
        }
        else {
            node temp = head;
            for (int i=0; i<idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

            return idx;
        }

        public void removeFirst(){
        if (size == 0){
            System.out.println("List is empty");
        }
        else if (size == 1){
            head = tail = null;
            size = 0;
        }
        else {
            head = head.next;
            size--;
        }
    }
        public void removeLast(){
            if (size == 0){
                System.out.println("List is empty");
            }
            else if (size == 1){
                head = tail =null;
                size = 0;
            }
            else{
                node temp = head;
                for (int i=0; i<size-2; i++){
                    temp = temp.next;
                }
                tail = temp;
                temp.next = null;
                size--;
            }
    }
        public void removeAt(int idx){
            if (size == 0){
                System.out.println("List is empty");
            }
            else if (idx<0 || idx>=size){
                System.out.println("Invalid Argument");
            }
            else if (idx == 0){
                removeFirst();
            }
            else if (idx == size-1){
                removeLast();
            }
            else {
                node temp = head;
                for (int i=0; i<idx-2; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;

            }
    }

        public void addFirst(int val){
           node temp = new node();
           temp.data = val;
           temp.next = head;
           head = temp;
           if (size() == 0){
               tail = temp;
           }
           size++;

        }
        public void addLast(int val){
        if (size() == 0){
            node temp = new node();
            temp.data = val;
            temp.next = null;

            head = tail = temp;

            size++;
        }
        else {
            node temp = new node();
            temp.data = val;
            temp.next = null;

            tail.next = temp;
            tail = temp;

            size++;
        }
    }
        public void addAt(int idx, int val){
            if (this.size() == 0){
                addFirst(val);
            }
            else if (idx == this.size()+1){
                addLast(val);
            }
            else if (idx<1  || idx>this.size()+1){
                System.out.println("Invalid Argument");
            }
            else {
                node node = new node();
                node.data = val;

                node temp = head;

                for (int i=0; i<idx-3; i++){
                    temp = temp.next;
                }
                temp.next = node;

                node.next = temp.next;

            }
    }
//  -------------------------------------------------- reverse list with data iterative
        private node getNodeAt(int idx){
            node temp = head;
            for (int i=0; i<idx; i++){
                temp = temp.next;
            }
            return temp;
    }
        public void reverseDI(){
            int li = 0;
            int ri = size-1;
            while (li<ri){
                node left = getNodeAt(li);
                node right = getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
    }
//  --------------------------------------------------- reverse list with pointer iterative
        public void reversePI(){
            node previous = null;
            node current = head;

            while (current != null){
//              saving the value
                node next = current.next;

                current.next = previous;

//              increasing with one of both
                previous = current;
                current = next;
            }
            node temp = head;
            head = tail;
            tail = temp;
        }

        public node delete_whole_Nodes(node head){

            head = null;
            System.out.println("list is deleted");
            return head;
        }

        public linkedList removeDuplicates_Unsorted_List(node head, node tail){

            if (this.head == null){
                return null;
            }
            else if (this.head.next == null){
                return this;
            }

            this.mergeSort(head, tail);
            this.removeDuplicates_2();

            node temp = this.head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            return this;





        }

        public linkedList detect_And_Remove_Loops(node head){
            if (this.head == null){
                return null;
            }
            else if(this.head.next == null){
                return this;
            }
            else {
                node slow = this.head;
                node fast = this.head;

                while (slow != null && fast != null && fast.next != null){
                    slow = slow.next;
                    fast = fast.next.next;

                    if (slow == fast){
                        System.out.println("loop is tetected");
                        break;
                    }
                }
                if (slow == this.head){
                    while (fast.next != slow){
                        fast = fast.next;
                    }
                    fast.next = null;
                }
                else if (slow == fast){
                    slow = this.head;
                    while (slow.next != fast.next){
                        slow = slow.next;
                        fast = fast.next;
                    }
                    fast.next = null;
                }
            }
            return this;
        }

        public int kthElementFromLast(int kth){
//          CONDTION:-
//          print kth element from the oppsite side of kth position.
//          if 0 then print last, if 1 then print second last
//          without using rucursion and size property
//          but you can use iteration BUT single iteration.

//          APPROACH:-
//          firstly increase "first" variables by kth times. THEN
//          if till not reached "first" variables on tail then increase both by one.
//          if reached, then "slow" also be reached on that point(kth)
//          and then return data of the "slow" position.
            node first = head;
            node slow = head;
            for (int i=0; i<kth; i++){
                first = first.next;
            }
            while (first != tail){
                first = first.next;
                slow = slow.next;
            }
            return slow.data;
        }

        public node mid(){
//          CONDITION:-
//          same CONDITION of kthElementFromLast functio
//          if size is odd then easily found mid, if size is even
//          then return last element of half size.

//          APPROACH:-
//          "slow" jumped one step and "fast" jumped two steps each time in iteration.
//          if position of "fast" on tail then position of "slow" also on that point

            if (head == null){
                return head;
            }

            node slow = head;
            node fast = head;

//                 for odd              for even
            while (fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        public static node midNode(node head, node tail){
        node fast = head;
        node slow = head;
        while (fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

//      --------------------------------------------------------------------------

        public static linkedList mergeTwoSortedList(linkedList l1, linkedList l2){
        node first_point = l1.head;
        node second_point = l2.head;

        linkedList result = new linkedList();

        while (first_point != null && second_point != null){
            if (first_point.data< second_point.data){
                result.addLast(first_point.data);
                first_point = first_point.next;
            }else {
                result.addLast(second_point.data);
                second_point = second_point.next;
            }
        }
        while (first_point != null){
            result.addLast(first_point.data);
            first_point = first_point.next;
        }
        while (second_point != null){
            result.addLast(second_point.data);
            second_point = second_point.next;
        }
        return result;
    }
        public static linkedList mergeSort(node head, node tail){

            node mid = midNode(head, tail);

            if (head == tail){
                linkedList baseResult = new linkedList();
                baseResult.addLast(head.data);
                return baseResult;
            }

            linkedList fsh = mergeSort(head, mid);
            linkedList ssh = mergeSort(mid.next, tail);

            linkedList completeList = mergeTwoSortedList(fsh, ssh);

            return completeList;
        }

//      --------------------------------------------------------------------------

        public node sortTwoList_1(node a, node b){
        node result = null;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;

        /* Pick either a or b, and recur */
        if (a.data <= b.data) {
            result = a;
            result.next = sortTwoList_1(a.next, b);
        }
        else {
            result = b;
            result.next = sortTwoList_1(a, b.next);
        }
        return result;
    }
        public node mergeSort_1(node head){
        // Base case : if head is null
            if (head == null || head.next == null) {
                return head;
            }

            // get the middle of the list
            node middle = mid();

            node nextofmiddle = middle.next;

            // set the next of middle node to null
            middle.next = null;

            // Apply mergeSort on left list
            node left = mergeSort_1(head);

            // Apply mergeSort on right list
            node right = mergeSort_1(nextofmiddle);

            // Merge the left and right lists
            node sortedlist = sortTwoList_1(left, right);
            return sortedlist;
    }

//      --------------------------------------------------------------------------

        public void removeDuplicates_2(){
//          remove duplicates only in sorted linked list.

            linkedList result = new linkedList();

            while (this.size()>0){
                int val = this.getFirst();
                this.removeFirst();
                if (result.size()==0 || result.tail.data != val){
                    result.addLast(val);
                }
            }
//          do result head of on the "this.head"...., because "this.size"
//          is now empty, due to removed all element, so, set for again
            this.head = result.head;
            this.tail = result.tail;
            this.size = result.size;

        }

        public void oddEvenRessemble(){
            linkedList odd = new linkedList();
            linkedList even = new linkedList();
            while (this.size()>0){
                int val = this.getFirst();
                this.removeFirst();
                if (val%2==0){
                    even.addLast(val);
                }
                else {
                    odd.addLast(val);
                }
            }
            if (odd.size()>0 && even.size()>0){
                odd.tail.next = even.head;

                this.head = odd.head;
                this.tail = even.tail;
                this.size = odd.size+even.size;
            }
            else if (odd.size()>0){
                this.head = odd.head;
                this.tail = odd.tail;
                this.size = odd.size;
            }
            else if (even.size()>0){
                this.head = even.head;
                this.tail = even.tail;
                this.size = even.size;
            }
        }

        public void kReverse(int k){
            linkedList previous = null;

            while (this.size()>0){
                linkedList current = new linkedList();

                if (this.size()>=k){
                    for (int i=0; i<k; i++){
                        int val = this.getFirst();
                        this.removeFirst();
                        current.addFirst(val);
                    }
                }
                else {
                    int size1 = this.size();
                    for (int i=0; i<size1; i++){
                        int val = this.getFirst();
                        this.removeFirst();
                        current.addLast(val);
                    }
                }

                if (previous == null){
                    previous = current;
                }
                else {
//                  joining both current + previous
                    previous.tail.next = current.head;

//                  setting new tail and size.
                    previous.tail = current.tail;
                    previous.size += current.size();
                }
            }
//          because "this" is now empty, then setting again
            this.head = previous.head;
            this.tail = previous.tail;
            this.size = previous.size();
        }

//      -------- without changing data only displaying reverse using node data
        private void reverseDisplayHelper(node node){
            if (node == null){
                return;
            }
//          putting the data in a stack down to top, naturally
            reverseDisplayHelper(node.next);
//          now, printing the data dop to down
            System.out.print(node.data+" ");
        }
        public void displayReverse(){
            reverseDisplayHelper(head);
            System.out.println();
        }

//      --------- without changing data only displaying reverse using pointers
        private void reversePR_Helper(node node){
            if (node == null){
                return;
            }
//          PUTTING THE NODE DATA ONE BY ONE IN STACK
            reverseDisplayHelper(node.next);

//          NOW TIME TO RETURNING DOWN FROM TOP IN A STACK
            if (node == tail){
//             Uper se wapas aate samay, agar node tail pe hai, kuchh mat karo
            }else {
//              Stack me Uper se wapas aate samay node ka next ka next khud ko
//              hi point kare
                node.next.next = node;

            }


    }
        public void displayReversePR(){
            reverseDisplayHelper(head);

            head.next = null;

            node temp = head;
            head = tail;
            tail = temp;
    }

//      ------ using Ex-changing node data member and displaying reverse with O(n), with recursive

        public void reverseDR_Helper(node right, int floor){
            if (right == null){
                return;
            }
            reverseDR_Helper(right.next,  floor+1);

            if (floor>=size()/2){
                int temp = right.data;
                right.data = rleft.data;
                rleft.data = temp;

                rleft = rleft.next;
            }

    }
        node rleft;
        public void reverseDR(){
        rleft = head;
        reverseDR_Helper(head, 0);
    }

//      ---------------------------------------- LinkedList is palindrom or not
        public boolean isPalidrom_Helper(node right, int floor){
            if (right == null){
                return true;
            }

            boolean r_res = isPalidrom_Helper(right.next, floor+1);

            if (r_res == false){
                return false;
            }
            else if (left.data != right.data){
                return false;
            }
            else {
                left = left.next;
                return true;
            }
    }
//      "left" value storing in heap not in stack
        node left;
        public void isPalindrome(){
          left = head;
          isPalidrom_Helper(head, 0);
    }
//      ----------------------------------------- Folding a LinkedList
        public void foldLinkedList_Helper(node right, int floor){
//     before folding      1-->2-->3-->4-->5-->6-->7-->8
//     after foldindg      1-->8-->2-->7-->3-->6-->4-->5

            if (right == null){
                return;
            }
            foldLinkedList_Helper(right.next, floor+1);

            if (floor>size()/2){
                node temp = left.next;

                left.next = right;
                right.next = temp;
                left = temp;
            }
            else if (floor == size()/2){
                tail = right;
                tail.next = null;
            }

    }
        node Fleft;
        public void foldLinkedList(){
        left = head;
        foldLinkedList_Helper(head, 0);
    }

//      ------------------------------------------------------ add two LinkedList by digits
        public static int addLinkedList_Helper(node one, int pv1, node two, int pv2,
                                           linkedList result){
            if (one==null && two==null){
                return 0;
            }
            int data = 0;
            if (pv1>pv2){
                int oldCarry = addLinkedList_Helper(one.next, pv1-1, two, pv2, result);
                //              now time to returning down from top
                data = one.data + oldCarry;
            }
            else if (pv1<pv2){
                int oldCarry = addLinkedList_Helper(one, pv1, two.next, pv2-1, result);
                //              now time to returning down from top
                data = two.data + oldCarry;
            }
            else {
                int oldCarry = addLinkedList_Helper(one.next, pv1-1, two.next, pv2-1, result);
                //              now time to returning down from top
                data = one.data + two.data + oldCarry;
            }
            int newData = data%10;
            int newCarry = data/10;
            result.addFirst(newData);
            return newCarry;
    }
        public static linkedList addTwoLinkedList(linkedList one, linkedList two){
            linkedList result = new linkedList();
            int oldCarry = addLinkedList_Helper(one.head, one.size(), two.head, two.size(), result);
            if (oldCarry>0){
                result.addFirst(oldCarry);
            }
            return result;
    }

//      ----------------------------------------------- find intersection of two linked list
//      p1>p1>p1             p2
//      1--2--3--4     3--2--1   <--LinkedList (1)
//               |     1                                     length  9 - 7 = 2
//               5--6--7--8--9   <--LinkedList (2)
//                     6
//                     3

        public static int findIntersection(linkedList one, linkedList two){
            node p1 = one.head;
            node p2 = two.head;

            int delta = Math.abs(one.size() - two.size());

//            after found both size, then initialize again, if "size" is calculated by while loop.
//            node p1 = one.head;
//            node p2 = two.head;

            if (one.size()>two.size()){
                for (int i=0; i<delta; i++){
                    p1 = p1.next;
                }
            }
            else {
                for (int i=0; i<delta; i++){
                    p2 = p2.next;
                }
            }
            while (p1 != p2){
                p1 = p1.next;
                p2 = p2.next;
            }
            if (p1==p2){
                return p1.data;
            }
            return -1;
    }

        public static node removeDuplicates_3(node head) {
        node curr = head;

        while (curr != null) {
            node temp = curr;

            while(temp!=null && temp.data==curr.data) {
                temp = temp.next;
            }

            curr.next = temp;
            curr = curr.next;
        }
        return head;
    }

        public static void removeDuplicates_1(node head){

            node curr = head;
            node temp;
            while (curr.next != null){

                if (curr.data == curr.next.data){
                    temp = curr.next.next;
                    curr.next = null;
                    curr.next = temp;
                }
                else {
                    curr = curr.next;
                }
            }
    }

        public node removeDuplicates_UNSORTED_111(node head){

        HashMap<Integer,Integer> map = new HashMap<>();

        node curr = head;

        map.put(curr.data, 1);

        node prev = curr;
        curr = curr.next;
        while(curr != null){

            boolean exists = map.containsKey(curr.data);
            if(exists == true){
                prev.next = curr.next;
                curr.next = null;
            }
            else{
                map.put(curr.data, 1);
                prev = curr;
            }
            curr = prev.next;
        }
        return head;
    }

        public void removeDuplicates_Unsorted_2(node head){
        node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;

        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;

            while (ptr2.next != null) {

                if (ptr1.data == ptr2.next.data) {

                    dup = ptr2.next;
                    ptr2.next = ptr2.next.next;
                    System.gc();
                }
                else {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }
//#############################################################################################
        public static node reversePI(node head){
        node curr = head;
        node prev = null;

        while (curr != null){
            node temp = curr.next;
            curr.next = prev;

            prev = curr;
            curr = temp;
        }
        return prev;

    }

        public static void addTwoLists(node first, node second){

//        first = reversePI(first);
//        second = reversePI(second);
//        node ans = new node(0);
//        node result = ans;
//
//        int carry  = 0;
//
//        while (first != null || second != null){
//
//            int x = (first!=null)? first.data : 0;
//            int y = (second!=null)? second.data : 0;
//            int sum = carry + x + y;
//            carry = sum/10;
//            result.next = new node(sum%10);
//            result = result.next;
//
//            if (first!=null)first = first.next;
//            if (second!=null)second = second.next;
//        }
//        if (carry>0){
//            result.next = new node(carry);
//        }
//        node tp = reversePI(ans.next);
//        return tp;
    }
//##################################################################################
        public static node findIntersection(node head1, node head2) {

            HashMap<Integer, Integer> map = new HashMap();

            node result = null;
            node temp1 = head1;
            node temp2 = head2;
            node lHead = null;

            while (temp1 != null){
                map.put(temp1.data, 1);
                temp1 = temp1.next;
            }
            System.out.println("size "+map.size());
            System.out.print(map.keySet());

            while (temp2 != null){
                if (map.containsKey(temp2.data)){

                    if (result == null){

                        node fn = new node();
                        fn.data = temp2.data;
                        fn.next = null;

                        result = fn;
                        lHead = fn;

                        map.remove(temp2.data);
                    }
                    else {
                        node newn = new node();
                        newn.data = temp2.data;
                        newn.next = null;

                        result.next = newn;

                        result = result.next;

                        map.remove(temp2.data);
                    }
                }

                temp2 = temp2.next;
            }

            return lHead;
        }
//##################################################################################
        public static void main (String[] args) throws java.lang.Exception{
    // your code goes here
    try {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {

            LinkedHashMap<Character, Object> map = new LinkedHashMap();

            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            int a = 0;
            int b = 0;
            sc.nextLine();

            String str2 = "EQUINOX";

            for (int i = 0; i < str2.length(); i++) {
                char c = str2.charAt(i);
                map.put(c, 1);

            }
            for (int i = 0; i < N; i++) {
                String str = sc.nextLine().toUpperCase();
//                    str.trim();

                if (map.containsKey(str.charAt(0))) {
                    a = a + A;
                } else if (!map.containsKey(str.charAt(0))){
                    b = b + B;

                }
            }
            if (a > b) {
                System.out.println("SARTHAK");
            } else if (a < b) {
                System.out.println("ANURADHA");
            } else{
                System.out.println("DRAW");
            }
        }
    } catch(Exception e) {
        return;
    }



}
//################################ from BST series last topic ######################
//       Intersection Node In Two LinkedList Using Floyad Cycle Method
         public static node startingNode0fCycle(node head){
            if (head==null || head.next==null){
                return null;
            }

            node slow = head;
            node fast = head;
            while (slow != fast){
                slow = slow.next;
                fast = fast.next.next;

                if (slow==fast){
                    break;
                }
            }
            if (slow != fast){ return  null; }

            slow = head;
            fast = fast;

            while (slow != fast){
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
         }
         public static node intersectionNodeInTwoLL(node headA, node headB){
            if (headA==null || headB==null){
                return null;
            }

            node tail = headA;
            while (tail.next != null){
                tail = tail.next;
            }
//          modifying, means making cycle
            tail.next = headB;

            node res = startingNode0fCycle(headA);

//          UNmodifying
            tail.next = null;

            return res;
         }




    }
}






