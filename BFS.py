from collections import deque
def breadthfirstsearch(graph,st):
    visited=set()
    q=deque([st])
    res=[]
    visited.add(st)
    while q:
        curr=q.popleft();
        res.append(curr)
        for nei in graph[curr]:
            if nei not in visited:
                visited.add(nei)
                q.append(nei)
    print("->".join(res))
n={
    "A": ["B", "D"],
    "B": ["E","C"],
    "C": ["B","F"],
    "D": [],
    "E": [],
    "F": ["G"],
    "G": []

}
breadthfirstsearch(n,"A")
