package Builder.BuilderPattern;

 class ActionClass {

    private  int clickCount; // final are required , non final are Optional
    private int scrollPageCount;
    private int holdShiftkeyMin;
    private int releaseShiftkeyMin;

    public ActionClass(ActionClassBuilder acb)
    {
        this.clickCount = acb.clickCount;
        this.holdShiftkeyMin = acb.holdShiftkeyMin;
        this.releaseShiftkeyMin = acb.releaseShiftkeyMin;
        this.scrollPageCount = acb.scrollPageCount;
    }

    public  static class  ActionClassBuilder

    {
        private int clickCount;  //
        private int scrollPageCount;
        private int holdShiftkeyMin;
        private int releaseShiftkeyMin;

        public ActionClassBuilder(int clickCount)
        {
            this.clickCount = clickCount;
        }

        public ActionClassBuilder  holdShiftkey(int minutes)
        {
            this.holdShiftkeyMin = minutes;
            System.out.println("Inside Hold SHIFT KEY ");
            return this ;
        }
        public ActionClassBuilder ScrollPage(int count )
        {
            this.scrollPageCount = count;
            System.out.println("Inside ScrollPage  ");
            return this ;
        }

        public ActionClassBuilder releaseShiftKey(int count )
        {
            this.releaseShiftkeyMin = count;
            System.out.println("release shift key ");
            return this ;
        }

        public ActionClass build()
        {
            ActionClass ac = new ActionClass(this);
            return ac;
        }
    }


}

public class ActionDemo
{
    public static void main(String[] args) {
         ActionClass action = new ActionClass.ActionClassBuilder(5).holdShiftkey(3).build();
         action = new ActionClass.ActionClassBuilder(6).ScrollPage(6).build();
         action = new ActionClass.ActionClassBuilder(7).releaseShiftKey(5).releaseShiftKey(4).ScrollPage(5).build();
    }
}
