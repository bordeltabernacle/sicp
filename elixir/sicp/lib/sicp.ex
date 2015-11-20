defmodule Sicp do

  @moduledoc """
  Exercises from Structure and Interpretation of Computer Programs
  in Elixir.
  """

  @doc """
  Exercise 1.3
  Define a function that takes three numbers as arguments
  and returns the sum of the squares of the two larger numbers.
  """
  @spec sum_sqrs_lrgst(Integer, Integer, Integer) :: Integer

  def sum_sqrs_lrgst(a, b, c) do
    [_, x, y] = Enum.sort([a, b, c])
    x * x + y * y
  end
end
