package OCP;

public interface Resource {
    int allocate();
    void free(int resourceId);
    void markBusy(int resourceId);
    void markFree(int resourceId);
    int findFreeSlot();
}