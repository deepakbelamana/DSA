def find(arr, n, x):
    reLi = []
    res = 0
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
    res = 0
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
    return reLi
if __name__ == '__main__':
    print(find([1,3,5,5,5,5,67,123,125],9,5))