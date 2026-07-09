res=[]
def depthfirstsearch(graph,st,visited=None):
    if visited is None:
        visited=set()
    if st in visited:
        return 
    res.append(st)
    visited.add(st)
    for nei in graph[st]:
        depthfirstsearch(graph,nei,visited)
n={
    "A": ["B", "D"],
    "B": ["E","C"],
    "C": ["B","F"],
    "D": [],
    "E": [],
    "F": ["G"],
    "G": []
}
depthfirstsearch(n,"A")
print(" -> ".join(res))
