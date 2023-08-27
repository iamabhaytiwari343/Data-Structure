class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def insert(self, value):
        new_node = Node(value)
        if self.head is None:
            self.head = new_node
        else:
            new_node.next = self.head
            self.head = new_node

    def delete(self, value):
        if self.head is None:
            print("List is empty. Cannot delete.")
            return

        if self.head.data == value:
            self.head = self.head.next
            return

        current = self.head
        while current.next is not None and current.next.data != value:
            current = current.next

        if current.next is not None:
            current.next = current.next.next
        else:
            print("Node not found. Cannot delete.")

    def display(self):
        current = self.head
        while current is not None:
            print(current.data, end=" ")
            current = current.next
        print()


if __name__ == "__main__":
    linked_list = LinkedList()

    linked_list.insert(10)
    linked_list.insert(20)
    linked_list.insert(30)

    linked_list.display()

    linked_list.delete(20)
    linked_list.display()
