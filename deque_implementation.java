  public static void push_back_pb(ArrayDeque<Integer> dq, int x) {
    // Your code here
    dq.offerLast(x);
}

// Function to pop element from back of the deque.
  public static void pop_back_ppb(ArrayDeque<Integer> dq) {
    // Your code here
    dq.pollLast();
}

// Function to return element from front of the deque.
  public static int front_dq(ArrayDeque<Integer> dq) {
    // Your code here
    if (dq.isEmpty()) return -1;
    int front = dq.peekFirst();
    return front;
}

// Function to push element x to the front of the deque.
  public static void push_front_pf(ArrayDeque<Integer> dq, int x) {
    // Your code here
    dq.offerFirst(x);
}
