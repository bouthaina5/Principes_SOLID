public abstract class ResourceAllocator
{
    public abstract int allocate();
    public abstract void free(int resourceId);
   
}