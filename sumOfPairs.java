def sum_pairs(ints, s):
    seen = set()
    for x in ints:
        complement = s - x
        if complement in seen:
            return [complement, x]
        seen.add(x)
    return None