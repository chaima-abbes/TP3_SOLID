package OCP;

public class TimeSlotResource implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeSlot();
        markBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markFree(resourceId);
    }

    @Override
    public void markBusy(int resourceId) {
        System.out.println("Marking time slot " + resourceId + " as busy");
    }

    @Override
    public void markFree(int resourceId) {
        System.out.println("Marking time slot " + resourceId + " as free");
    }

    @Override
    public int findFreeSlot() {
        return 1;
    }
}