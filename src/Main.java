
public class Main {
    public static void main(String[] args) throws PermissionException {
        System.out.println("Hello world!");
        User userA = new User();
        Design design = userA.createDesign();
        User userB = new User();
        userA.shareDesign(design, userB);
        //userB.editDesign(design.getDesignId(), "B");
        System.out.println("Hello world!");
    }
}

// user can edit their own design
// user can edit other design if given permission


// see if user can edit the particular design
//