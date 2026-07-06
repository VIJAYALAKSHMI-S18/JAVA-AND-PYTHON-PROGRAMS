class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def insert_first(self, x):
        new_node = Node(x)
        new_node.next = self.head
        self.head = new_node

    def insert_last(self, x):
        new_node = Node(x)

        if self.head is None:
            self.head = new_node
            return

        curr = self.head

        while curr.next:
            curr = curr.next

        curr.next = new_node

    def insert_middle(self, pos, x):
        new_node = Node(x)

        curr = self.head
        prev = self.head

        while curr.next:
            if curr.data == pos:
                break
            prev = curr
            curr = curr.next

        new_node.next = prev.next
        prev.next = new_node

    def delete_first(self):
        curr = self.head
        self.head = curr.next

    def delete_last(self):
        curr = self.head
        prev = self.head

        while curr.next:
            prev = curr
            curr = curr.next

        prev.next = None

    def delete_middle(self, pos):
        curr = self.head
        prev = self.head

        while curr.next:
            if curr.data == pos:
                break
            prev = curr
            curr = curr.next

        prev.next = curr.next

        print(prev.data)
        print(curr.data)

    def display(self):
        curr = self.head
        ans = []

        while curr:
            ans.append(curr.data)
            curr = curr.next

        print(ans)


# Driver Code
n = SinglyLinkedList()

n.insert_first(10)
n.insert_first(20)
n.insert_last(2)
n.insert_last(13)
n.insert_last(15)
n.insert_last(56)
n.insert_first(77)

n.insert_middle(13, 78)

# n.delete_first()
# n.delete_last()
# n.delete_middle(56)
# n.delete_middle(15)

n.display()