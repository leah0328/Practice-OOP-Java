import java.util.HashMap;
import java.util.Map;

public class User {
    private final int userId;
    private final Map<Integer, Design> designIds;

    public User() {
        this.userId = 2;
        this.designIds = new HashMap<>();
    }

    public int getUserId() {
        return userId;
    }

    public Design createDesign() {
        Design design = new Design(this);
        int designId = design.getDesignId();
        designIds.put(designId, design);
        return design;
    }

    public Design getDesign(int designId) {
        return designIds.get(designId);
    }

    public void deleteDesign(int designId) {
        designIds.remove(designId);
    }

    public void editDesign(int designId, String newContent) throws PermissionException {
        Design design = designIds.get(designId);
        design.setContent(this ,newContent);
    }

    // let user
    public void addDesign(Design design) {
        designIds.put(design.getDesignId(), design);
    }


    // put designId and design into the user's designIds
    public void shareDesign (Design design, User user) {
        user.addDesign(design);
    }
}


