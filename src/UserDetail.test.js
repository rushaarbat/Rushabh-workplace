import { cleanup, render, screen } from "@testing-library/react";
import UserDetail from "./UserDetail";

afterEach(() => {
  cleanup();
});
test("should have test content", () => {
  render(<UserDetail />);
  const element = screen.getByTestId("user-detail-id");
  expect(element).toBeInTheDocument();
});

test("should have test content", () => {
  const testData = {
    name: "Rushabh",
  };
  render(<UserDetail name={testData.name} />);
  const element = screen.getByTestId("user-detail-id");
  expect(element).toHaveTextContent("Name: " + testData.name);
  expect(element).toContainHTML("h1");
});
