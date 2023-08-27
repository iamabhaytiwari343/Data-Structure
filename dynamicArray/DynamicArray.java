public class DynamicArray<T> {
    private Object[] array;
    private int size;
    private int capacity;

    public DynamicArray() {
        capacity = 10;  // Initial capacity
        array = new Object[capacity];
        size = 0;
    }

    public void add(T element) {
        if (size == capacity) {
            resizeArray();
        }
        array[size] = element;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index for removal.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return null;
        }
        return (T) array[index];
    }

    public int size() {
        return size;
    }

    private void resizeArray() {
        capacity *= 2;  // Double the capacity
        Object[] newArray = new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);

        System.out.println("Dynamic Array size: " + dynamicArray.size());
        System.out.println("Element at index 1: " + dynamicArray.get(1));

        dynamicArray.remove(1);

        System.out.println("Dynamic Array size after removal: " + dynamicArray.size());
    }
}
