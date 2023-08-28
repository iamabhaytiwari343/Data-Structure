class Queue:
    def __init__(self):
        self.queue = []

    def enqueue(self, item):
        self.queue.append(item)

    def dequeue(self):
        if not self.is_empty():
            return self.queue.pop(0)
        else:
            print("Queue is empty. Cannot dequeue.")
            return None

    def peek(self):
        if not self.is_empty():
            return self.queue[0]
        else:
            print("Queue is empty. Cannot peek.")
            return None

    def is_empty(self):
        return len(self.queue) == 0

    def size(self):
        return len(self.queue)


if __name__ == "__main__":
    queue = Queue()

    queue.enqueue(10)
    queue.enqueue(20)
    queue.enqueue(30)

    print("Queue size:", queue.size())
    print("Front of the queue:", queue.peek())

    print("Dequeued item:", queue.dequeue())
    print("Dequeued item:", queue.dequeue())

    print("Is queue empty?", queue.is_empty())
