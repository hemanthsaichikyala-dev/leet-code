def int_to_roman(num):
    # Step 1: store values and symbols from large to small
    values = [1000, 900, 500, 400, 100, 90, 50, 40,
              10, 9, 5, 4, 1]
    symbols = ["M", "CM", "D", "CD", "C", "XC", "L", "XL",
               "X", "IX", "V", "IV", "I"]

    # Step 2: result string
    roman = ""

    # Step 3: check each value
    for i in range(len(values)):
        # Step 4: while number is >= value
        while num >= values[i]:
            roman += symbols[i]   # add symbol
            num -= values[i]      # reduce number

    # Step 5: return result
    return roman
