#BBubble Sort
def bubble(a,n):
    for i in range(0,n-1):
        for j in range(0,n-1-i):
            if a[j]>a[j+1]:
                temp=a[j]
                a[j]=a[j+1]
                a[j+1]=temp

a=[9,7,2,1,10]
bubble(a,5)
print(a)
