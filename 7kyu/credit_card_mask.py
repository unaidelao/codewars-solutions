# 7 kyu
# Credit card mask - Python


# return masked string
def maskify(cc):
    return "#"*(len(cc)-4) + cc[-4:]


t1 = "4556364607935616"
t2 = "64607935616"
t3 = "1"
t4 = ""

t1_mask = maskify(t1)
t2_mask = maskify(t2)
t3_mask = maskify(t3)
t4_mask = maskify(t4)

print(t1_mask)
print(t2_mask)
print(t3_mask)
print(t4_mask)
