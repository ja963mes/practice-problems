def gimme(input_array):
    # Implement this function
    largest_value = max(input_array)
    smallest_value = min(input_array)
    for num in input_array:
        if(num > smallest_value and num < largest_value):
            return input_array.index(num)