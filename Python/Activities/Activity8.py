listA = []
n = int(input("Enter number of elements in the list : "))
# iterating till the range
for i in range(0, n):
   print("Enter element No-{}: ".format(i+1))
   elm = int(input())
   listA.append(elm) # adding the element
firstElement = listA[0]
# Get last element in list
lastElement = listA[-1]
if (firstElement == lastElement):
    print(True)
else:
    print(False)

'''exampleList = [int(item) for item in input("Enter the list items : ").split()]
print("Given list is ", exampleList)

if (exampleList[0] == exampleList[-1]):
    print(True)
else:
    print(False)'''