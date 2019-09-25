package app.flyingpigstudios.singletonexample.model;

public class BubbleWrap {

    private static final int ADD_MORE_BUBLES = 10;
    private int numBubles;


    /*
    Singleton Code
     */

    private static BubbleWrap instance;

    private BubbleWrap(){
        // Private to prevent anyone else from instantiating
    }

    public static BubbleWrap getInstance(){
        if(instance == null){
            instance = new BubbleWrap();
        }
        return instance;
    }

    /*
    Singleton Code
     */





    /*
        Normal Object Code
     */

    public int getNumBubles() {
        return numBubles;
    }

    public void addMoreBubbles(){
        numBubles += ADD_MORE_BUBLES;
    }

    public void popBubble(){
        numBubles--;
    }
}
