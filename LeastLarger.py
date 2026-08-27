def least_larger(a, i): 
    value = a[i]
    index = -1
    for pos, val in enumerate(a):
        if val > value and (index == -1 or val < a[index]):
            index = pos
    return index