def kthElement( k, arr1, arr2):
    li = []
    left = 0
    right = 0
    arl = len(arr1)
    arr = len(arr2)
    while left < arl and right < arr:
        if arr1[left] <= arr2[right]:
            li.append(arr1[left])
            left += 1
        else:
            li.append(arr2[right])
            right += 1
    while left < arl:
        li.append(arr1[left])
        left += 1
    while right < arr:
        li.append(arr2[right])
        right += 1
    return li[k - 1]