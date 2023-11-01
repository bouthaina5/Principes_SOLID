
public class SpaceSlot extends ResourceAllocator{
	
	@Override
	public int allocate() {
		int resourceId = findFreeSpaceSlot();
    	markSpaceSlotBusy(resourceId);
    	return ressourceId;
	}
	@Override
    public void free(int resourceId)
    { 
		markSpaceSlotFree(resourceId);
     }
	private int findFreeSpaceSlot()
	{
		return 0;
	}
	private void markSpaceSlotBusy(int resourceId)
	{ }
    private void markSpaceSlotFree(int resourceId)
    {
    }
}
