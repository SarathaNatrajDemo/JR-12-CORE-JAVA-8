package com.demo.samples.day9.designpatterns.behavioural.iterator;

public class ProductCatalog {
	public String productCatalog[] = { "Toothbrush", "Soap", "Toothpaste", "Sampoo", "Handwash" };

	public Iterator getIterator() {
		return new ProductIterator();
	}

	private class ProductIterator implements Iterator {
		int index;

		@Override
		public boolean hasNext() {
			if (index < productCatalog.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			Object obj = null;
			if (this.hasNext()) {
				return productCatalog[index++];
			} else
				return obj;
		}
	}
}
