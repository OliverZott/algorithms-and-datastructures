def string_reversal(input_string: str) -> str:
    if not isinstance(input_string, str):
        raise TypeError("Sorry, wrong input-type. Please input string.")

    return input_string[::-1]


if __name__ == '__main__':
    import time

    value = 'Lenchen'

    t = time.process_time()
    result = string_reversal(value)
    # exception = string_reversal(123)
    elapsed_time = time.process_time() - t

    print(f"ExecutionTime: {elapsed_time} ms / Result: {result}")
    # print(f"ExecutionTime: {elapsed_time} ms / Result: {exception}")
