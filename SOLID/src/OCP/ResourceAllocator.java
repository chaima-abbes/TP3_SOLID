package OCP;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource) {
        if (resource == null) {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            return INVALID_RESOURCE_ID;
        }
        return resource.allocate();
    }

    public void free(Resource resource, int resourceId) {
        if (resource != null) {
            resource.free(resourceId);
        } else {
            System.out.println("ERROR: attempted to free invalid resource");
        }
    }
}