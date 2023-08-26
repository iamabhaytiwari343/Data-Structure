class Stack:
    def __init__(self, size):
        self.max_size = size
        self.stack_list = []

    def push(self, value):
        if len(self.stack_list) < self.max_size:
            self.stack_list.append(value)
        else:
            print("Stack is full. Cannot push", value)

    def pop(self):
        if self.stack_list:
            return self.stack_list.pop()
        else:
            print("Stack is empty. Cannot pop.")
            return None

    def peek(self):
        if self.stack_list:
            return self.stack_list[-1]
        else:
            print("Stack is empty. Cannot peek.")
            return None

    def is_empty(self):
        return len(self.stack_list) == 0

    def is_full(self):
        return len(self.stack_list) == self.max_size


stack = Stack(5)

stack.push(10)
stack.push(20)
stack.push(30)

print("Top element:", stack.peek())

print("Popped element:", stack.pop())
print("Popped element:", stack.pop())

print("Is stack empty?", stack.is_empty())
print("Is stack full?", stack.is_full())
