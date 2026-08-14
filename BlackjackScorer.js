function scoreHand(cards) {
  let total = 0;
  let aces = 0;

  for (const card of cards) {
    if (card === "A") {
      aces += 1;
      total += 11;
    } else if (card === "J" || card === "Q" || card === "K") {
      total += 10;
    } else {
      total += parseInt(card, 10);
    }
  }

  // Downgrade aces from 11 to 1 as needed while over 21
  while (total > 21 && aces > 0) {
    total -= 10;
    aces -= 1;
  }

  return total;
}