F=range
import random as B
def A(num_codes=25):
	E='-';C='2346789BCDFGHJKMNPQRTVWXYZ';D=[]
	while len(D)<num_codes:
		A='2'+''.join(B.choices(C,k=4))+E+E.join(''.join(B.choices(C,k=5))for A in F(3))+E+''.join(B.choices(C,k=4))+'Z'
		if not any(A[B:B+3]==A[B+3:B+6]for B in F(len(A)-6)):D.append(A)
	return D
for C in A():print(C)