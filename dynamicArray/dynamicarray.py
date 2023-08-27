class DynamicArray:
    def __init__(self, capacity=10):
        self.capacity = capacity
        self.array = [None] * self.capacity
        self.size = 0

    def add(self, element):
        if self.size == self.capacity:
            self.resize_array()
        self.array[self.size] = element
        self.size += 1

    def remove(self, index):
        if index < 0 or index >= self.size:
            print("Invalid index for removal.")
            return

        for i in range(index, self.size - 1):
            self.array[i] = self.array[i + 1]

        self.size -= 1

    def get(self, index):
        if index < 0 or index >= self.size:
            print("Invalid index.")
            return None
        return self.array[index]

    def size(self):
        return self.size

    def resize_array(self):
        self.capacity *= 2
        new_array = [None] * self.capacity
        for i in range(self.size):
            new_array[i] = self.array[i]
        self.array = new_array


if __name__ == "__main__":
    dynamic_array = DynamicArray()

    dynamic_array.add(10)
    dynamic_array.add(20)
    dynamic_array.add(30)

    print("Dynamic Array size:", dynamic_array.size())
    print("Element at index 1:", dynamic_array.get(1))

    dynamic_array.remove(1)

    print("Dynamic Array size after removal:", dynamic_array.size())
