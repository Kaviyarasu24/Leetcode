class BIT:
    def __init__(self,size):
        self.tree=[0]*(size+2)

    def update(self,i,delta):
        i+=1
        while i<len(self.tree):
            self.tree[i]+=delta
            i+=i&-i
    def query(self,i):
        i+=1
        res=0
        while i>0:
            res +=self.tree[i]
            i-=i&-i
        return res

    def range_query(self,l,r):
        return self.query(r)-self.query(l-1)
        


class Solution(object):
    def popcountDepth(self, nums, queries):
        def depth(x):
            d=0;
            while x!=1:
                x=bin(x).count('1')
                d+=1
            return d
        n=len(nums)
        depth_arr=[depth(x) for x in nums]
        bits={}
        for i,d in enumerate(depth_arr):
            if d not in bits:
                bits[d]=BIT(n)
            bits[d].update(i,1)
        ans=[]
        for q in queries:
            if q[0]==1:
                l,r,k=q[1:]
                if k not in bits:
                    ans.append(0)
                else:
                    ans.append(bits[k].range_query(l,r))
            else:
                idx,val=q[1:]
                old_d=depth_arr[idx]
                bits[old_d].update(idx,-1)
                new_d=depth(val)
                depth_arr[idx]=new_d
                if new_d not in bits:
                    bits[new_d]=BIT(n)
                bits[new_d].update(idx,1)
        return ans

