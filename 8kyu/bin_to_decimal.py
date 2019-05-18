# 8 kyu
# Bin to Decimal - Python
# Complete the function which converts a binary number (given as a string) to a decimal number.


def bin_to_decimal(inp):
    return int(inp, 2)


print(bin_to_decimal("0"))         # 0
print(bin_to_decimal("1"))         # 1
print(bin_to_decimal("10"))        # 2
print(bin_to_decimal("11"))        # 3
print(bin_to_decimal("101010"))    # 42
print(bin_to_decimal("1001001"))   # 73
