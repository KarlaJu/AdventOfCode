defmodule AdventOfCode do
  defmodule DayOne do
    def santaInstructions(list), do: calculate(list, 0)
    defp calculate([], num), do: num
    defp calculate([h | t], num) when h == "(", do: calculate(t, num + 1)
    defp calculate([h | t], num) when h == ")", do: calculate(t , num - 1)
    defp calculate([h | t], num) when h == "", do: calculate(t, num)
  end
end
