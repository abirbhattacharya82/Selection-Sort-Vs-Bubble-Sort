#Selecton Sort
def selection(a,n):
    min=a[0]
    pos=0
    for i in range(0,n-1):
        min=a[i]
        pos=i
        for j in range(i+1,n):
            if a[j]<min:
                pos=j
                min=a[j]
        temp=min
        a[pos]=a[i]
        a[i]=temp

a=[9,7,2,1,10]
selection(a,5)
print(a)
