from collections import deque

class queueck:
    def __init__(self):
        self.q=deque()

    def enqueue(self,val):
        self.q.append(val)
        print('append val is',val)
    
    def dequeue(self):
        if self.is_empty():
            return 'queue is empty please add the val then dequeue element'
        pp=self.q.popleft()
        print('deque element is queue',pp)
    
    def front(self):
        if self.is_empty():
            return 'queue is empty please add the val then dequeue element'
        print('front view in queue',self.q[0])
    def rear(self):
        if self.is_empty():
            return 'queue is empty please add the val then dequeue element'
        print('rear view in queue',self.q[-1])


    def is_empty(self):
        if len(self.q)==0:
            return 'the queue is empty'
        
obj=queueck()
obj.enqueue(10)
obj.enqueue(20)
obj.enqueue(30)
obj.enqueue(40)
obj.dequeue()
obj.front()
obj.rear()