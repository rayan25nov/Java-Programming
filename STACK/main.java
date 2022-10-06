package Stack;

public class main {
    public static void main(String[] args) {
        stack st = new stack(3);
        st.push(2);
        st.push(1);
        st.pop();
        st.getTop();
        st.getHeight();
        st.printStack();
    }
    
}
