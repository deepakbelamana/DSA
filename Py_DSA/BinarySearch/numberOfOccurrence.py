def count(arr, n, x):
    reLi=[]
    res = -1
    start = 0
    end = n - 1
    # first occurence
    while start <= end:
        mid = start + (end - start) // 2
        if arr[mid] == x:
            res = mid
            end = mid - 1
        elif arr[mid] > x:
            end = mid - 1
        else:
            start = mid + 1
    reLi.append(res)
    res = -1
    start = 0
    end = n - 1
    # last occurence
    while start <= end:
        mid = start + (end - start) // 2
        if arr[mid] == x:
            res = mid
            start = mid + 1
        elif arr[mid] > x:
            end = mid - 1
        else:
            start = mid + 1
    reLi.append(res)
    result = 0 if reLi[1]==-1 and reLi[0]==-1 else reLi[1]-reLi[0]+1
    return result