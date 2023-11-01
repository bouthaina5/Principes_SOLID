public class TimeSlot extends ResourceAllocator{
	
	@Override
	public int allocate() {
    	
		int resourceId = findFreeTimeSlot();
    	markTimeSlotBusy(resourceId);
    	return ressourceId;
}
	@Override
    public void free(int resourceId)
    { 
		markTimeSlotFree(resourceId);
     }
	private int findFreeTimeSlot()
	{
		return 0;
	}
	private void markTimeSlotBusy(int resourceId)
	{ }
    private void markTimeSlotFree(int resourceId)
    {
    }
}
