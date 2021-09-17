xr_arr=[0] #Nos genera un arreglo 0 el primer elemento 0 "
print(xr_arr)
print(len(xr_arr))
for i in range(3*(10**0)+1): #i= [0-N>
    xr_arr.append(xr_arr[i]^(i+1)) # xr_arr.pb()
print("---------------------")
for i in xr_arr:
	print(i)

T=int(input()) 
for t in range(T):
    a,b=map(int,input().split()) 
    ans=a 
    xr=xr_arr[a-1]
    if xr!=b and xr^b!=a:
        print(ans+1)
    elif xr!=b:
        print(ans+2)
    else:
        print(ans) 
	
