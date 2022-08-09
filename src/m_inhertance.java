import io.sentry.Sentry;
public class m_inhertance {
    public void main(String[] args) {
        var opration=new op();
        op.sub(3,4);
        op.sum(3,4);

    }
    interface sum{
        abstract public void sum(int a,int b);
    }
    interface sub extends sum{
        abstract public void sub(int a,int b);
    }
     class op implements sub{
        @Override
        public void sub(int a, int b) {
            System.out.println("Sub = "+(a-b));
        }

        @Override
        public void sum(int a, int b) {
            System.out.println("Sum = "+(a+b));
        }
    }
}
