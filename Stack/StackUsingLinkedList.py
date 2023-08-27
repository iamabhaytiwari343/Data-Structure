class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class StackUsingLinkedList:
    def __init__(self):
        self.top = None  # Top node of the stack

    def push(self, value):
        new_node = Node(value)
        new_node.next = self.top  # Set the new node's next to the current top
        self.top = new_node       # Update top to the new node

    def pop(self):
        if self.top:
            popped_value = self.top.data  # Get the data from the top node
            self.top = self.top.next      # Move top to the next node
            return popped_value
        else:
            print("Stack is empty. Cannot pop.")
            return None

    def peek(self):
        if self.top:
            return self.top.data  # Return the data from the top node
        else:
            print("Stack is empty. Cannot peek.")
            return None

    def is_empty(self):
        return self.top is None  # Stack is empty when top is None


stack = StackUsingLinkedList()

stack.push(10)
stack.push(20)
stack.push(30)

print("Top element:", stack.peek())

print("Popped element:", stack.pop())
print("Popped element:", stack.pop())

print("Is stack empty?", stack.is_empty())
