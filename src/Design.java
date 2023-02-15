import java.util.HashSet;
import java.util.Set;

public class Design {
    private int designId;
    private String content;
    private int ownerUserId;

    private Set<Integer> accessibleByUser;


    public Design (User user){
        designId=1; // change to UUId
        this.content = "";
        this.ownerUserId = user.getUserId();
        this.accessibleByUser = new HashSet<>();
        accessibleByUser.add(ownerUserId);
    }

    public int getDesignId() {
        return designId;
    }

    public String getContent(User user) throws PermissionException {
        if (accessibleByUser.contains(user.getUserId())) {
            return content;
        } else {
            throw new PermissionException(user.getUserId() + "do not have permission to get content");
        }
    }

    public void setContent(User user, String newContent) throws PermissionException{
        if (accessibleByUser.contains(user.getUserId())) {
            content = newContent;
        } else {
            throw new PermissionException(user.getUserId() + "do not have permission to set content");
        }

    }




}
